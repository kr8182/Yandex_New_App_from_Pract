public class Converter {
    double rateUSD;
    double rateEUR;
    double rateCNY;

    Converter(double usd, double eur, double cny) {
        rateUSD = usd;
        rateEUR = eur;
        rateCNY = cny;
    }

    void convert(double rubles, int currency) {
        if (currency == 1) {
            System.out.println("���� ���������� � ��������: " + rubles / rateUSD);
        } else if (currency == 2) {
            System.out.println("���� ���������� � ����: " + rubles / rateEUR);
        } else if (currency == 3) {
            System.out.println("���� ���������� � �����: " + rubles / rateCNY);
        } else {
            System.out.println("������� ����������� ������.");
        }
    }
}