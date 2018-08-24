package com.gmail.a1ekskosyak.Arrays;

import org.junit.*;

import static com.gmail.a1ekskosyak.Arrays.TwoDArrayDs.hourglassSum;
import static org.junit.Assert.assertEquals;

public class TwoDArrayDsTest {

    @BeforeClass
    public static void setUpBeforeClass() {
    }

    @AfterClass
    public static void tearDownBeforeClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
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

    @Test
    public void hourglassSum_ReturnsSum_IfOnlyOneHourglass() {
        // given
        int[][] array = new int[][]{
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}};

        // when
        int result = hourglassSum(array);

        // then
        assertEquals(7, result);
    }

    @Test
    public void hourglassSum_ReturnsSum_IfArrayHasNegativeValues() {
        // given
        int[][] array = new int[][]{
                {-1, -1, -1, 0, 0, 0},
                {0, -1, 0, 0, 0, 0},
                {-1, -1, -1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}};

        // when
        int result = hourglassSum(array);

        // then
        assertEquals(0, result);
    }

    @Test
    public void hourglassSum_ReturnsMaxSum_IfInputHasMultipleHourglasses() {
        // given
        int[][] array = new int[][]{
                {-9, -9, -9, 1, 1, 1},
                {0, -9, 0, 4, 3, 2},
                {-9, -9, -9, 1, 2, 3},
                {0, 0, 8, 6, 6, 0},
                {0, 0, 0, -2, 0, 0},
                {0, 0, 1, 2, 4, 0}};

        // when
        int result = hourglassSum(array);

        // then
        assertEquals(28, result);
    }
}