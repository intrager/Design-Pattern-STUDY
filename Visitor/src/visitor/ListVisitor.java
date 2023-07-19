package visitor;

import java.util.Iterator;

public class ListVisitor extends Visitor {

    private String currentDir = "";

    @Override
    public void visit(File f) {
        System.out.println(currentDir + "/" + f);
    }

    @Override
    public void visit(Directory dir) {
        System.out.println(currentDir + "/" + dir);

        String saveDir = currentDir;
        currentDir = currentDir + "/" + dir.getName();
        Iterator<Entry> iter = dir.iterator();

        while(iter.hasNext()) {
            Entry entry = iter.next();
            entry.accept(this);
        }

        currentDir = saveDir;
    }
}
