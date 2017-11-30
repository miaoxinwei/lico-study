package com.lico.study.bitmap;

import com.googlecode.javaewah.EWAHCompressedBitmap;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * 项目：lico-study
 * 包名：com.lico.study.bitmap
 * 功能：
 * 时间：2017-11-17
 * 作者：miaoxw
 */
public class BitmapTest {

    @Test
    public void testBuildWindow() throws Exception {

        EWAHCompressedBitmap ewahCompressedBitmap;

        ewahCompressedBitmap = EWAHCompressedBitmapUtil.buildWindow(249410, 5090, 325729);

        assertTrue(ewahCompressedBitmap.get(249410));
        assertTrue(ewahCompressedBitmap.get(249411));
        assertThat(ewahCompressedBitmap.cardinality(), is(5090));

        ewahCompressedBitmap = EWAHCompressedBitmapUtil.buildWindow(63, 1, 128);

        assertTrue(ewahCompressedBitmap.get(63));
        assertThat(ewahCompressedBitmap.cardinality(), is(1));

        ewahCompressedBitmap = EWAHCompressedBitmapUtil.buildWindow(0, 1, 128);

        assertTrue(ewahCompressedBitmap.get(0));
        assertThat(ewahCompressedBitmap.cardinality(), is(1));


        ewahCompressedBitmap = EWAHCompressedBitmapUtil.buildWindow(63, 2, 128);

        assertTrue(ewahCompressedBitmap.get(63));
        assertTrue(ewahCompressedBitmap.get(64));
        assertThat(ewahCompressedBitmap.cardinality(), is(2));

        ewahCompressedBitmap = EWAHCompressedBitmapUtil.buildWindow(0, 128, 128);

        assertTrue(ewahCompressedBitmap.get(0));
        assertTrue(ewahCompressedBitmap.get(1));
        assertThat(ewahCompressedBitmap.cardinality(), is(128));
    }

    @Test
    public void basictest() {
        System.out.println("Testing ThresholdFuncBitmap");
        EWAHCompressedBitmap ewah1 = EWAHCompressedBitmap.bitmapOf(1, 53, 110, 1000, 1201, 50000);
        EWAHCompressedBitmap ewah2 = EWAHCompressedBitmap.bitmapOf(1, 100, 1000, 1100, 1200, 31416, 50001);
        EWAHCompressedBitmap ewah3 = EWAHCompressedBitmap.bitmapOf(1, 110, 1000, 1101, 1200, 1201, 31416, 31417);

        assertTrue(EWAHCompressedBitmap.threshold(1, ewah1).equals(ewah1));
        assertTrue(EWAHCompressedBitmap.threshold(1, ewah2).equals(ewah2));
        assertTrue(EWAHCompressedBitmap.threshold(1, ewah3).equals(ewah3));
        assertTrue(EWAHCompressedBitmap.threshold(2, ewah1, ewah1).equals(ewah1));
        assertTrue(EWAHCompressedBitmap.threshold(2, ewah2, ewah2).equals(ewah2));
        assertTrue(EWAHCompressedBitmap.threshold(2, ewah3, ewah3).equals(ewah3));

        EWAHCompressedBitmap zero = new EWAHCompressedBitmap();
        assertTrue(EWAHCompressedBitmap.threshold(2, ewah1).equals(zero));
        assertTrue(EWAHCompressedBitmap.threshold(2, ewah2).equals(zero));
        assertTrue(EWAHCompressedBitmap.threshold(2, ewah3).equals(zero));
        assertTrue(EWAHCompressedBitmap.threshold(4, ewah1, ewah2, ewah3).equals(zero));

        EWAHCompressedBitmap ewahorth = EWAHCompressedBitmap.threshold(1, ewah1, ewah2, ewah3);
        EWAHCompressedBitmap ewahtrueor = EWAHCompressedBitmap.or(ewah1, ewah2, ewah3);
        assertTrue(ewahorth.equals(ewahtrueor));

        EWAHCompressedBitmap ewahandth = EWAHCompressedBitmap.threshold(3, ewah1, ewah2, ewah3);

        ewahandth.setSizeInBitsWithinLastWord(maxSizeInBits(ewah1, ewah2, ewah3));
        EWAHCompressedBitmap ewahtrueand = EWAHCompressedBitmap.and(ewah1, ewah2, ewah3);
        assertTrue(ewahandth.equals(ewahtrueand));

        EWAHCompressedBitmap ewahmajth = EWAHCompressedBitmap.threshold(2, ewah1, ewah2, ewah3);
        ewahmajth.setSizeInBitsWithinLastWord(maxSizeInBits(ewah1, ewah2, ewah3));
        EWAHCompressedBitmap ewahtruemaj = EWAHCompressedBitmap.or(ewah1.and(ewah2), ewah1.and(ewah3), ewah2.and(ewah3));
        assertTrue(ewahmajth.equals(ewahtruemaj));
    }


    private static int maxSizeInBits(final EWAHCompressedBitmap... bitmaps) {
        int maxSizeInBits = 0;
        for (EWAHCompressedBitmap bitmap : bitmaps) {
            maxSizeInBits = Math.max(maxSizeInBits, bitmap.sizeInBits());
        }
        return maxSizeInBits;
    }
}
