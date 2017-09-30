package com.lico.study.rxjava;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * 项目：lico-study
 * 包名：com.lico.study.rxjava
 * 功能：
 * 时间：2017-09-29
 * 作者：呱牛
 */
public class ObserverTest {

    public static void main(String[] args) {
        //创建Observer
        Observer<String> observer = new Observer<>() {
            @Override
            public void onSubscribe(Disposable disposable) {

            }

            @Override
            public void onNext(String s) {
            }

            @Override
            public void onError(Throwable e) {
            }

            @Override
            public void onComplete() {

            }
        };
    }
}
