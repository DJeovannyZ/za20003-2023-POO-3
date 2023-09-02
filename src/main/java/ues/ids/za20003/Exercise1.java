package ues.ids.za20003;

public class Exercise1 {
    private int note;

    public Exercise1(int note) {
        this.note = note;
    }

    public int getNote(){
        return this.note;
    }

    public String validateNote() {
        if (this.note >= 0 && this.note <= 4) {
            return "Insuficiente";
        } else if (this.note == 5) {
            return "Suficiente";
        } else if (this.note == 6) {
            return "Bien";
        } else if (this.note == 7 || this.note == 8) {
            return "Notable";
        } else if (this.note == 9 || this.note == 10) {
            return "Sobresaliente";
        } else {
            return "La nota debe estar entre 1 y 10";
        }
    }
}
