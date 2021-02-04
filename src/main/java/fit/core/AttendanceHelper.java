package fit.core;

import java.util.HashMap;
import java.util.Map;

public class AttendanceHelper {

    public static Map<String, Boolean> random(int quantAluno, int porcentagemFalta) {
        HashMap<String, Boolean> alunoMap = new HashMap<>();

        for (int i = 0; i < quantAluno; i++) {
                if ( i < (porcentagemFalta * quantAluno) / 100 ) {
                    alunoMap.put("test " + i, true);
                }else {
                    alunoMap.put("test " + i, false);
                }
            }
         return alunoMap;
    }
}
