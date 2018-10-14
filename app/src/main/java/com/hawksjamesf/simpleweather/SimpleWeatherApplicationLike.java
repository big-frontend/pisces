package com.hawksjamesf.simpleweather;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.support.multidex.MultiDex;

import com.blankj.utilcode.util.Utils;
import com.hawksjamesf.mockserver.MockManager;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;
import com.orhanobut.logger.PrettyFormatStrategy;
import com.tencent.tinker.anno.DefaultLifeCycle;
import com.tencent.tinker.loader.app.DefaultApplicationLike;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import com.tinkerpatch.sdk.TinkerPatch;

/**
 * Copyright ® $ 2017
 * All right reserved.
 *
 * @author: hawks.jamesf
 * @since: Oct/14/2018  Sun
 */
@DefaultLifeCycle(
        application = "com.hawksjamesf.simpleweather.SimpleWeatherApplication",             //application name to generate
        flags = ShareConstants.TINKER_ENABLE_ALL)                                //tinkerFlags above
public class SimpleWeatherApplicationLike extends DefaultApplicationLike {

    public SimpleWeatherApplicationLike(Application application, int tinkerFlags, boolean tinkerLoadVerifyFlag, long applicationStartElapsedTime, long applicationStartMillisTime, Intent tinkerResultIntent) {
        super(application, tinkerFlags, tinkerLoadVerifyFlag, applicationStartElapsedTime, applicationStartMillisTime, tinkerResultIntent);
    }

    private static AppComponent appComponent;
    private static final String TAG = "SimpleWeatherApp---";

    @Override
    public void onBaseContextAttached(Context base) {
        super.onBaseContextAttached(base);
        // must install multiDex
        MultiDex.install(base);
        // install tinker
//         TinkerManager.installTinker(this); 替换成下面Bugly提供的方法
//        Beta.installTinker(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Logger.addLogAdapter(new AndroidLogAdapter(PrettyFormatStrategy.newBuilder().tag(TAG).build()) {
            @Override
            public boolean isLoggable(int priority, String tag) {
                return BuildConfig.DEBUG;
            }
        });

        appComponent = DaggerAppComponent.builder().build();
        Utils.init(getApplication());
//        CrashReport.initCrashReport(getApplication(), BuildConfig.BUGLY_APP_ID, BuildConfig.DEBUG);
        MockManager.init(getApplication());

        // 初始化TinkerPatch SDK, 更多配置可参照API章节中的,初始化 SDK
        TinkerPatch.init(this)
                .reflectPatchLibrary()
                .setPatchRollbackOnScreenOff(true)
                .setPatchRestartOnSrceenOff(true)
                .setFetchPatchIntervalByHours(3);

        // 每隔3个小时（通过setFetchPatchIntervalByHours设置）去访问后台时候有更新,通过handler实现轮训的效果
        TinkerPatch.with().fetchPatchUpdateAndPollWithInterval();
    }

    public static AppComponent getAppComponent() {
        return appComponent;
    }
}
