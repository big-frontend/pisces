package com.hawksjamesf.spacecraft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import java.util.Arrays;

import reactor.core.publisher.Mono;

/**
 * Copyright ® $ 2017
 * All right reserved.
 *
 * @author: jf.chen
 * @since: Dec/18/2018  Tue
 */
@SpringBootApplication
public class App {
    public static void main(String... args) {
        System.out.println(""+ Arrays.toString(args));
        SpringApplication.run(App.class, args);

    }

    @Repository
    interface UserRepo {
        void find();

        <T extends ServerResponse> Mono<T> find(ServerRequest serverRequest);
    }

    @Bean
    public RouterFunction<ServerResponse> routerFunction(UserRepo userRepo) {
//         new RouterFunction<ServerResponse>() {
//            @Override
//            public Mono<HandlerFunction<ServerResponse>> route(ServerRequest request) {
//               return new RequestPredicate();
//            }
//        }
        System.out.println("hello world");

        return RouterFunctions.route(RequestPredicates.GET("token/"), userRepo::find);

    }
}
