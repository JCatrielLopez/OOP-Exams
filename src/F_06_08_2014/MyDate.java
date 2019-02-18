package F_06_08_2014;

public class MyDate extends Primitive {

    String value;

    public MyDate(String date){ //DD-MMM-YYYY
        this.value = date;
    }

    public String getValue(){
        return this.value;
    }

    public static int strToInt( String str ){
        int i = 0;
        int num = 0;
        boolean isNeg = false;

        if (str.charAt(0) == '-') {
            isNeg = true;
            i = 1;
        }

        while( i < str.length()) {
            num *= 10;
            num += str.charAt(i++) - '0';
        }

        if (isNeg)
            num = -num;
        return num;
    }

    public MyDate sum(MyInteger i){
        String[] value_parts = value.split("-");
        MyInteger day = new MyInteger(strToInt(value_parts[0]));
        String month = value_parts[1];
        MyInteger year = new MyInteger((strToInt(value_parts[2])));

        int ord = -1;
        Month[] months = Month.values();

        for (Month m: months) {
            if (m.equals(month))
                ord = m.ordinal();
        }

        if (ord != -1){
            if (day.sum(i).isGreatherTan(new MyInteger(31))) {
                ord++;
                day = new MyInteger(day.sum(i).getValue() - 31);
                if (ord > months.length) {
                    month = months[0].toString();
                    year.sum(new MyInteger(1));
                }
            }
            else
                day = day.sum(i);

            StringBuilder new_date = new StringBuilder();

            new_date.append(day);
            new_date.append("-");
            new_date.append(month);
            new_date.append("-");
            new_date.append(year);

            return new MyDate(new_date.toString());

        }

        return null;

    }

    public MyDate sum(MyFloat f){
        throw new ArithmeticException();
    }
}
