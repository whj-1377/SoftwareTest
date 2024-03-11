package Test2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.assertEquals;


class TriangleTest {
    void paramTriangle(int a, int b,int c,String expected) {
        Triangle triangle = new Triangle();

        String type = triangle.classify(a, b, c);

        assertEquals(expected, type);
    }
    @DisplayName(value="三角形一般边界测试用例")
    @ParameterizedTest
    @CsvFileSource(resources = "/generalBoundary.csv",numLinesToSkip =1,encoding = "UTF-8")
    void fileTest(int a, int b,int c,String expected) throws ParseException {

        Triangle triangle=new Triangle();

        String type = triangle.classify(a, b, c);

        assertEquals(expected, type);
    }
    @DisplayName(value="三角形健壮性最坏情况测试用例")
    @ParameterizedTest
    @CsvFileSource(resources = "/worstRobustness.csv",numLinesToSkip =1,encoding = "UTF-8")
    void fileTest1(int a, int b,int c,String expected) throws ParseException {

        Triangle triangle=new Triangle();

        String type = triangle.classify(a, b, c);

        assertEquals(expected, type);
    }
    @DisplayName(value="三角形健壮测试用例")
    @ParameterizedTest
    @CsvFileSource(resources = "/robustnessBoundary.csv",numLinesToSkip =1,encoding = "UTF-8")
    void fileTest2(int a, int b,int c,String expected) throws ParseException {

        Triangle triangle=new Triangle();

        String type = triangle.classify(a, b, c);

        assertEquals(expected, type);
    }
    @DisplayName(value="三角形一般最坏情况测试用例")
    @ParameterizedTest
    @CsvFileSource(resources = "/generallyWorst.csv",numLinesToSkip =1,encoding = "UTF-8")
    void fileTest3(int a, int b,int c,String expected) throws ParseException {
        Triangle triangle=new Triangle();

        String type = triangle.classify(a, b, c);

        assertEquals(expected, type);
    }
}
