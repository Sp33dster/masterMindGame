package test.unit;

import org.junit.Test;
import org.junit.Assert;
import pl.speedster.main.Color;
import pl.speedster.main.ColorManager;

class ColorManagerTest {

    private static final int NR_COLORS = 6;

    @Test
    public void thereIsAFirstColor(){
        ColorManager manager = new ColorManager(NR_COLORS);
        System.out.println(manager.firstColor());
        Assert.assertNotNull(manager.firstColor());
    }

    @Test
    public void noNextColorIsNullWhenThereIsOne() {
        ColorManager manager = new ColorManager(NR_COLORS);
        Color color = manager.firstColor();
        while (manager.thereIsNextColor(color)) {
            Assert.assertNotNull(color = manager.nextColor(color));
        }
    }

    @Test
    public void noColorHasNoNextColor(){
        ColorManager manager = new ColorManager(NR_COLORS);
        Assert.assertNull(manager.nextColor(Color.none));
    }
}