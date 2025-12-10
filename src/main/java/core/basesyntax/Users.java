package core.basesyntax;

import java.util.List;

public class Users implements Cloneable {
    private List<Users> users;

    @Override
    protected Users clone() {
        try {
            return (Users) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
