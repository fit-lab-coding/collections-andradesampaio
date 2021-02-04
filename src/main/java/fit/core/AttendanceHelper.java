package fit.core;

import java.util.HashMap;
import java.util.Map;

public class AttendanceHelper {

    public static Map<String, Boolean> random(int quantAluno, int porcentagemFalta) {
        HashMap<String, Boolean> alunoMap = new HashMap<>();
        int  porcentagem = (porcentagemFalta * quantAluno) / 100;

        for (int i = 0; i < quantAluno; i++) {
                if ( i < porcentagem ) {
                    alunoMap.put("test " + i, true);
                }else {
                    alunoMap.put("test " + i, false);
                }
            }
         return alunoMap;
    }
}
