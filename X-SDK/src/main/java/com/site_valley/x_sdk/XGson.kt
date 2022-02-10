/*
 * Created by abhinav for ETAOP Pvt. Ltd.
 * Copyright (c) 2022 . All rights reserved.
 * Last Updated on 11/02/22, 12:51 AM
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
          *
          *
          * apk:
    name: Generate APK
    runs-on: ubuntu-latest

    steps:
      - uses: actions/checkout@v1
      - name: set up JDK 11
        uses: actions/setup-java@v1
        with:
          java-version: 11
      - name: Build debug APK
        run: bash ./gradlew assembleDebug --stacktrace
      - name: Create Release Build
        id: signArtifact
        uses: r0adkll/sign-android-release@v1.0.1
        with:
          releaseDirectory: app/build/outputs/apk/ourbuildtype/release
          alias: ${{ secrets.KEYALIAS }}
          signingKeyBase64: ${{ secrets.KEYSTORE }}
          keyStorePassword: ${{ secrets.KEYSTORE_PASSWORD }}
          keyPassword: ${{ secrets.KEY_PASSWORD }}
      - name: Github Sec
        run: echo ${{ secrets.GITHUB_TOKEN }}
      - name: Github Data
        run: echo ${{ github.event.release }}
      - name: Github Event
        run: echo ${{ github.event }}
      - name: Github ENV
        run: echo ${{ github.env.test }}
      - name: Upload our APK
        uses: actions/upload-artifact@v2.2.0
        with:
          name: Release artifact
          path: app/build/outputs/apk/ourbuildtype/release/*.apk
      - name: Create Release For SDK
        id: create_release
        uses: actions/create-release@v1
        env:
          GITHUB_TOKEN: ${{ secrets.GITHUB_TOKEN }}
        with:
          tag_name: ${{ github.event.release.tag_name }}
          release_name: Release ${{ github.event.release.tag_name }}
          draft: false
          prerelease: false
*/