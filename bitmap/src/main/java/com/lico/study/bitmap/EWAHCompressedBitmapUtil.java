package com.lico.study.bitmap;

import com.googlecode.javaewah.EWAHCompressedBitmap;

/**
 * 项目：lico-study
 * 包名：com.lico.study.bitmap
 * 功能：
 * 时间：2017-11-17
 * 作者：miaoxw
 */
public class EWAHCompressedBitmapUtil {

    public static EWAHCompressedBitmap buildWindow(int start, int length, int size) {

        EWAHCompressedBitmap ewahCompressedBitmap = new EWAHCompressedBitmap((int) Math.ceil(size / (double) EWAHCompressedBitmap.WORD_IN_BITS));
        // first set everything to false until "start"
        double ceil = Math.ceil(start / (double) EWAHCompressedBitmap.WORD_IN_BITS);

        ewahCompressedBitmap.addStreamOfEmptyWords(false, (long) ceil);
        // leftover are the bits which are leftover from first
        int overwritten = (int) (ceil * EWAHCompressedBitmap.WORD_IN_BITS - start);

        // we have at most written more than leftover values that are incorrect - already part of value
        int toWrite = length - overwritten;

        // now write the remaining values

        // we also overwrote the end
        ewahCompressedBitmap.addStreamOfEmptyWords(true, (long) Math.ceil(toWrite / (double) EWAHCompressedBitmap.WORD_IN_BITS));

        // fix the beginning by setting the missing values
        for (int i = start; i < start + overwritten; i++) {
            ewahCompressedBitmap.set(i);
        }

        // and fix the end by clearing the not used bits - ignore any fancy calculations
        for (int i = start + length; i < start + length + EWAHCompressedBitmap.WORD_IN_BITS; i++) {
            ewahCompressedBitmap.clear(i);
        }

        ewahCompressedBitmap.trim();

        return ewahCompressedBitmap;
    }
}
