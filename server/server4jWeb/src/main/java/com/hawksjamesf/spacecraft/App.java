package com.hawksjamesf.spacecraft;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

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
        System.out.println("" + Arrays.toString(args));
        SpringApplication.run(App.class, args);

    }

//    @Repository
//    interface UserRepo {
//        void find();
//
//        <T extends ServerResponse> Mono<T> find(ServerRequest serverRequest);
//    }
//
//    @Bean
//    public RouterFunction<ServerResponse> routerFunction(ApplicationContext ctx) {
////         new RouterFunction<ServerResponse>() {
////            @Override
////            public Mono<HandlerFunction<ServerResponse>> route(ServerRequest request) {
////               return new RequestPredicate();
////            }
////        }
////        System.out.println("hello world");
//        return RouterFunctions.route(RequestPredicates.GET("token/"),null);
//
//    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }


}
