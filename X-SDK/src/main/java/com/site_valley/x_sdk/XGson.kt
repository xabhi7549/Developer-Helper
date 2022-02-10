/*
 * Created by abhinav for ETAOP Pvt. Ltd.
 * Copyright (c) 2022 . All rights reserved.
 * Last Updated on 10/02/22, 6:08 PM
 */

package com.site_valley.x_sdk

import com.google.gson.Gson

object XGson {

    fun getXGson(): Gson {
        return Gson()
    }

}


/*
* # This workflow uses actions that are not certified by GitHub.
# They are provided by a third-party and are governed by
# separate terms of service, privacy policy, and support
# documentation.
# This workflow will build a Java project with Gradle and cache/restore any dependencies to improve the workflow execution time
# For more information see: https://help.github.com/actions/language-and-framework-guides/building-and-testing-java-with-gradle

name: Java CI with Gradle

on:
  push:
    branches: [ master ]
  pull_request:
    branches: [ master ]

jobs:
  build:

    runs-on: ubuntu-latest

    steps:
      - uses: actions/checkout@v2
      - name: Set up JDK 11
        uses: actions/setup-java@v2
        with:
          java-version: '11'
          distribution: 'temurin'
      - name: Build all artifacts
        id: buildAllApks
        uses: eskatos/gradle-command-action@v1.3.3
        with:
          gradle-version: current
          wrapper-cache-enabled: true
          dependencies-cache-enabled: true
          configuration-cache-enabled: true
          arguments: assembleRelease

*/