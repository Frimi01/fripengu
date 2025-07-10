package io.github.frimi01.fripengu.data;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.XmlReader;
import com.badlogic.gdx.utils.Array;

public class DataManager {

    public static Array<XmlReader.Element> loadTasks() {
        XmlReader xml = new XmlReader();
        XmlReader.Element root = xml.parse(Gdx.files.internal("data/tasks.xml"));
        return root.getChildrenByName("task");
    }
}
