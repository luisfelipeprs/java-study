package exercise.ex2;

public class Data {
        private int dia;
        private int mes;
        private int ano;

        public Data(){



        }

        public Data(int dia, int mes, int ano) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
            if (!this.dataEhValida()) {
                this.dia = 1;
                this.mes = 1;
                this.ano = 1;
            }
        }

        private boolean dataEhValida() {
            // Verifica se a data é válida
            int[] mesesCom31Dias = {1, 3, 5, 7, 8, 10, 12};
            int[] mesesCom30Dias = {4, 6, 9, 11};
            if (contains(mesesCom31Dias, this.mes)) {
                return this.dia <= 31;
            } else if (contains(mesesCom30Dias, this.mes)) {
                return this.dia <= 30;
            } else if (this.mes == 2) {
                if (isBissexto()) {
                    return this.dia <= 29;
                } else {
                    return this.dia <= 28;
                }
            } else {
                return false;
            }
        }

        private boolean isBissexto() {
            // Verifica se o ano da data é bissexto
            return (this.ano % 4 == 0 && this.ano % 100 != 0) || (this.ano % 400 == 0);
        }

        private boolean contains(int[] array, int element) {
            // Verifica se um elemento está presente em um array
            for (int i = 0; i < array.length; i++) {
                if (array[i] == element) {
                    return true;
                }
            }
            return false;
        }

        public int compara(Data outraData) {
            // Compara duas datas
            if (this.ano > outraData.ano) {
                return 1;
            } else if (this.ano < outraData.ano) {
                return -1;
            } else {
                if (this.mes > outraData.mes) {
                    return 1;
                } else if (this.mes < outraData.mes) {
                    return -1;
                } else {
                    if (this.dia > outraData.dia) {
                        return 1;
                    } else if (this.dia < outraData.dia) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            }
        }

        public int getDia() {
            // Retorna o dia da data
            return this.dia;
        }

        public int getMes() {
            // Retorna o mês da data
            return this.mes;
        }

        public String getMesExtenso() {
            // Retorna o mês da data por extenso
            String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                    "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
            return meses[this.mes - 1];
        }

        public int getAno() {
            // Retorna o ano da data
            return this.ano;
        }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Data{" +
                "dia=" + dia +
                ", mes=" + this.getMesExtenso() +
                ", ano=" + ano +
                '}';
    }
}
