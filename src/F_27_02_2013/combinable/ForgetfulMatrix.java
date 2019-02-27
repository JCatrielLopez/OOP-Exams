package F_27_02_2013.combinable;

import java.util.ArrayList;

public class ForgetfulMatrix extends MatrixDecorator {

    ArrayList<Object []> memory;

    public ForgetfulMatrix(Matrix matrix) {
        super(matrix);
        this.memory = new ArrayList<>();
    }

    @Override
    public void write(int x, int y, int z, Object data) {
        Object [] old_data = {x, y , z, this.matrix.read(x, y, z)};
        this.memory.add(this.memory.size()-1, old_data);
        super.write(x, y, z, data);
    }

    @Override
    public Object read(int x, int y, int z) {
        return super.read(x, y, z);
    }

    public void forget(){
        Object [] old_data = this.memory.get(this.memory.size()-1);

        int x = (int) old_data[0];
        int y = (int) old_data[1];
        int z = (int) old_data[2];
        Object data = old_data[3];
        super.write(x, y, z, data);

        this.memory.remove(this.memory.size()-1);
    }
}
