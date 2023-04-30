//#1
//
//public class Main {
//    public static void main(String[] args) {
//        String filterJson = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
//        Map<String, String> filterParams = new Gson().fromJson(filterJson, new TypeToken<Map<String, String>>() {}.getType());
//        StringBuilder whereClause = new StringBuilder();
//        boolean isFirst = true;
//        for (Map.Entry<String, String> entry : filterParams.entrySet()) {
//            String key = entry.getKey();
//            String value = entry.getValue();
//            if (!"null".equals(value)) {
//                if (isFirst) {
//                    whereClause.append("WHERE ");
//                    isFirst = false;
//                } else {
//                    whereClause.append("AND ");
//                }
//                whereClause.append(key).append(" = '").append(value).append("' ");
//            }
//        }
//        System.out.println("Generated WHERE clause: " + whereClause);
//    }
//}

//#2
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        int[] arr = {3, 6, 1, 8, 2, 4};
//        int n = arr.length;
//        for (int i = 0; i < n - 1; i++) {
//            boolean swapped = false;
//            for (int j = 0; j < n - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                    swapped = true;
//                }
//            }
//            System.out.println("Array after iteration " + (i + 1) + ": " + Arrays.toString(arr));
//            if (!swapped) {
//                break;
//            }
//        }
//        System.out.println("Sorted array: " + Arrays.toString(arr));
//        BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt"));
//        writer.write("Sorted array: " + Arrays.toString(arr));
//        writer.close();
//    }
//}

//#3
//
//public class Main {
//    private static final Logger logger = Logger.getLogger(Main.class.getName());
//
//    public static void main(String[] args) {
//        int a = 10;
//        int b = 5;
//        char operator = '+';
//        int result = 0;
//        switch (operator) {
//            case '+':
//                result = a + b;
//                break;
//            case '-':
//                result = a - b;
//                break;
//            case '*':
//                result = a * b;
//                break;
//            case '/':
//                result = a / b;
//                break;
//            default:
//                logger.warning("Invalid operator");
//        }
//        logger.info(a + " " + operator + " " + b + " = " + result);
//    }
//}
