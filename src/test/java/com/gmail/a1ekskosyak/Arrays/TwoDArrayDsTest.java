package com.gmail.a1ekskosyak.Arrays;

import org.junit.*;

import static com.gmail.a1ekskosyak.Arrays.TwoDArrayDs.hourglassSum;
import static org.junit.Assert.assertEquals;

public class TwoDArrayDsTest {
    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("Run before the first test method");
    }

    @AfterClass
    public static void tearDownBeforeClass() {
        System.out.println("Run after the last test method");
    }

    @Before
    public void setUp() {
        System.out.println("Run before each test");
    }

    @After
    public void tearDown() {
        System.out.println("Run after each test");
        System.out.println("---------------------------");
    }


    @Test
    public void hourglassSum_ReturnsZero_IfArrayConsistsOfZeroes() {
        // given
        int[][] array = new int[][]{
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}};

        // when
        int result = hourglassSum(array);
        // then
        assertEquals(0, result);
    }

}