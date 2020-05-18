package com.prvn.spring.ms.brew.beerservice.bootstarp;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

/**
 * File    : BeerLoaderApplicationListener
 * Created : 16/05/20
 * Last Changed  : 16/05/20 9:31 PM Sat
 * Author  : apple
 * History :
 * Initial impound
 */

// works as the Event based load on logic execution
// we will not get any command line arguments here
public class BeerLoaderApplicationListener implements ApplicationListener<ApplicationReadyEvent> {
    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        // startup logic goes here
        // this even will be fired after the application is ready

        // we have another ways to the same tasks
        // @PostConstructor
        // InitializingBeen Interface
    }
}
