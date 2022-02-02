public class ChristmasLights {

    private boolean[][] lights = new boolean[1000][1000];

    ChristmasLights() {}

    public void turnOnAllLights() {
        for (int i = 0; i < lights.length; i++){
            for (int j = 0; j < lights[i].length; j++){
                lights[i][j] = true;
            }
        }
    }

    public void turnOffAllLights() {
        for (int i = 0; i < lights.length; i++){
            for (int j = 0; j < lights[i].length; j++){
                lights[i][j] = false;
            }
        }
    }

    public void turnOnLights(int row_start, int column_start, int row_end, int column_end) {
        for (int i = row_start; i <= row_end; i++){
            for (int j = column_start; j <= column_end; j++){
                lights[i][j] = true;
            }
        }
    }

    public void turnOffLights(int row_start, int column_start, int row_end, int column_end) {
        for (int i = row_start; i <= row_end; i++){
            for (int j = column_start; j <= column_end; j++){
                lights[i][j] = false;
            }
        }
    }

    public void toggleLights(int row_start, int column_start, int row_end, int column_end) {
        turnOffAllLights();
        turnOnLights(row_start, column_start, row_end, column_end);
    }


    public int calculateLittedLights() {
        int amount_of_light_lit = 0;
        for (boolean[] light_row: lights) {
            for (boolean light: light_row) {
                if (light == true)
                    amount_of_light_lit += 1;
            }
        }
        return amount_of_light_lit;
    }
}
