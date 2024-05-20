public class CallBackTest {
    private WebDriver driver;

    @BeforeEach
    void setUp {driver = new ChromeDriver();}

    @AfterEach
    void tearDown(){
        driver.quit();
        driver = null;
    }

    @Test
    void shouldTest(){
        throw new UnsupportedOperationException();
    }
}
