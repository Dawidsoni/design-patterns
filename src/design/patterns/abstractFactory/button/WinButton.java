package design.patterns.abstractFactory.scrollbar;

import design.patterns.abstractFactory.button.IButton;

/**
 * Created by dawid on 08/07/16.
 */
public class WinButton implements IButton {

    @Override
    public void draw() {
        System.out.println("Drawing Windows button");
    }

}
