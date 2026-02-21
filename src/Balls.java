public class Balls {
    private int face;
    private String[] data = new String[2];

    public String[] getData() {
        return data;
    }

    public void showData(){
        for (int i = 0; i <data.length ; i++) {
            System.out.println(data[i]);
        }
    }
    public void setData(String[] data) {
        this.data = data;
    }

    public int getFace() {
        return face;
    }

    public void setFace(int face) {
        this.face = face;
    }
}
