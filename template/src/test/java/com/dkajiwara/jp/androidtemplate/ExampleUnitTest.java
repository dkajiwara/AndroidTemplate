package com.dkajiwara.jp.androidtemplate;

import android.text.TextUtils;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
        assertThat((TextUtils.equals("hoge", "hog")), is(false));
    }

    @Test
    public void mockList() throws Exception {
        List mockList = Mockito.mock(List.class);
        Mockito.when(mockList.get(0)).thenReturn("one");
        Mockito.when(mockList.get(1)).thenReturn("two");
        Mockito.doReturn("three").when(mockList).get(3);
    }
}