package F_27_02_2013;

public class ReadingMatrix implements Matrix {

    BasicMatrix matrix;
    BasicMatrix readings;

    public ReadingMatrix(){
        this.matrix = new BasicMatrix();
        this.readings = new BasicMatrix();
    }

    @Override
    public void write(int x, int y, int z, Object data) {
        this.matrix.write(x, y, z, data);
    }

    @Override
    public Object read(int x, int y, int z) {
        Object out = this.matrix.read(x, y, z);
        Integer read = (Integer) this.readings.read(x, y, z);
        this.readings.write(x, y, z, read+1);

        return out;
    }
}
