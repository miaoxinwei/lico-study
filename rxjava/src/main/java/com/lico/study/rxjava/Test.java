package com.lico.study.rxjava;

import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * 项目：lico-study
 * 包名：com.lico.study.rxjava
 * 功能：
 * 时间：2017-09-29
 * 作者：呱牛
 */
public class Test {

    public static void main(String[] args) {
        //创建Observable
        Observable.create((ObservableOnSubscribe<Integer>) emitter -> {
            emitter.onNext(1);
            emitter.onNext(2);
            emitter.onNext(3);
            emitter.onError(new Throwable("hello"));
        }).subscribe(new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {
                System.err.println("onSubscribe");
            }

            @Override
            public void onNext(Integer s) {
                System.err.println("onNext - > " + s);
            }

            @Override
            public void onError(Throwable e) {
                System.err.println("onError -> " + e.getLocalizedMessage());
            }

            @Override
            public void onComplete() {
                System.err.println("onComplete");
            }
        });


    }
}
