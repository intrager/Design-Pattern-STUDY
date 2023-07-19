package visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry {
    private String name;
    private ArrayList<Entry> dir = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator<Entry> iter = dir.iterator();
        while(iter.hasNext()) {
            Entry entry = (Entry) iter.next();
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public Entry add(Entry entry) { // Entry 추가
        dir.add(entry);
        return this;
    }

    @Override
    public Iterator<Entry> iterator() { // Iterator의 생성
        return dir.iterator();
    }

    @Override
    public void accept(Visitor v) { // 방문자를 받아들임임
        v.visit(this);
    }

}
