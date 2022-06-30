package practice.hospital;

public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {
        float[] patientTemperature = new float[patientsCount];
        float min = 32.0f;
        float max = 40.0f;
        for (int i = 0; i < patientsCount; i++) {
            patientTemperature[i] = (float) Math.random() * (max - min) + min;
        }
        return patientTemperature;
    }

    public static String getReport(float[] temperatureData) {
        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
            Округлите среднюю температуру с помощью Math.round до 2 знаков после запятой,
            а температуры каждого пациента до 1 знака после запятой
        */
        int countHealthy = 0;
        double averageTemperature = 0;
        StringBuilder strTemp = new StringBuilder();
        for (float temp : temperatureData) {
            strTemp.append(" ").append(Math.round(temp * 10) / 10.0);
            averageTemperature += temp;
            if (temp > 36.1 && temp < 37) {
                countHealthy++;
            }
        }
        averageTemperature = Math.round(averageTemperature / temperatureData.length * 100) / 100.0;
        String report =
                "Температуры пациентов:" + strTemp +
                        "\nСредняя температура: " + averageTemperature +
                        "\nКоличество здоровых: " + countHealthy;

        return report;
    }
}
