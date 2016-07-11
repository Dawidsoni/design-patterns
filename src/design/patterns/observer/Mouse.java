package design.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dawid on 11/07/16.
 */
public class Mouse {
    protected List<IMouseListener> listenerList = new ArrayList<>();

    public void addListener(IMouseListener listener) {
        listenerList.add(listener);
    }

    public void mouseChange() {
        for(IMouseListener listener : listenerList) {
            listener.update(this);
        }
    }
}
