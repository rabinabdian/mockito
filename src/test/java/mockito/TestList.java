package mockito;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.Every.everyItem;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestList {
    @Test
    public void letsMockListSize() {
        List list = mock(List.class);
        when(list.size()).thenReturn(10);
        assertEquals(10, list.size());
    }

    @Test
    public void letsMockListSizeWithMultipleReturnValues() {
        List list = mock(List.class);
        when(list.size()).thenReturn(10).thenReturn(20);
        assertEquals(10, list.size()); // First Call
        assertEquals(20, list.size()); // Second Call
    }

    @Test
    public void letsMockListGet() {
        List<String> list = mock(List.class);
        when(list.get(0)).thenReturn("in28Minutes");
        assertEquals("in28Minutes", list.get(0));

    }

    @Test
    public void letsMockListGet_assertNull() {
        List<String> list = mock(List.class);
        assertNull(list.get(1));
    }


    @Test(expected = RuntimeException.class)
    public void letsMockListGetToThrowException() {
        List<String> list = mock(List.class);
        when(list.get(Mockito.anyInt())).thenThrow(
                new RuntimeException("Something went wrong"));
        list.get(0);
    }

    @Test
    public void letsMockListGetWithAny() {
        List<String> list = mock(List.class);
        Mockito.when(list.get(Mockito.anyInt())).thenReturn("in28Minutes");
        // If you are using argument matchers, all arguments
        // have to be provided by matchers.
        assertEquals("in28Minutes", list.get(0));
        assertEquals("in28Minutes", list.get(1));
    }

    @Test
    public void bddAliases_UsingGivenWillReturn() {
        List<String> list = mock(List.class);

        //given
        given(list.get(Mockito.anyInt())).willReturn("in28Minutes");

        //then
        Assert.assertThat("in28Minutes", is(list.get(0)));
        Assert.assertThat("in28Minutes", is(list.get(1)));
    }


}
