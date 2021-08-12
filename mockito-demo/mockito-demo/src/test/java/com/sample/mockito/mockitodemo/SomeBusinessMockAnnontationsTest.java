package com.sample.mockito.mockitodemo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockAnnontationsTest {

	@Mock
	DataService dataServiceMock;

	@InjectMocks
	SomeBusinessImpl businessImpl;

	@Test
	public void testFindTheGreatestFromAllData() {
		// DataService dataServiceMock = mock(DataService.class);
		// dataServiceMock.retrieveAllData() => new int[] {24,15,3}
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 24, 15, 3 });

		// SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		assertEquals(24, businessImpl.findTheGreatestFromAllData());

	}

	@Test
	public void testFindTheGreatestFromOneValue() {
		// DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 15 });

		// SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		assertEquals(15, businessImpl.findTheGreatestFromAllData());
	}

	@Test
	public void testFindTheGreatestFromNoValue() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 15 });
		assertEquals(Integer.MIN_VALUE, businessImpl.findTheGreatestFromAllData());
	}
}
