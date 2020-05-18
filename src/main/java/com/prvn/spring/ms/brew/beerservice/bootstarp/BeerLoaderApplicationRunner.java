package com.prvn.spring.ms.brew.beerservice.bootstarp;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

/**
 * File    : BeerLoaderApllicationRunner
 * Created : 16/05/20
 * Last Changed  : 16/05/20 9:28 PM Sat
 * Author  : apple
 * History :
 * Initial impound
 */

// Same as CommandLineRunner : but parses the command line arguments
public class BeerLoaderApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        // Startup Logic goes here :
        // args gives parsed command line arguments
    }
}
