# 목차: 1.You 2.기억상실 3.등차수열 4.림보게임

---

1. ## You
문제요구사항:
또리는 챗봇을 만들었습니다. 챗봇은 메신저에서 유저와 소통하는 봇을 말합니다. 그런데 또리가 챗봇을 만드는 도중 중간에 실수가 있었는지 작동이 이상합니다.
챗봇은 You라고 입력하면 Me, 그 외의 모든 경우의 입력에는 No 라고 답합니다. 

챗봇에 입력한 문자열 A가 입력되었을 때 챗봇이 답한 문자열을 출력하는 프로그램을 만들어주세요.

'''java
public class Main {
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 

        String a = scanner.nextLine();
        
        if (a.equals("You")) {
            System.out.println("Me");
        } else {
            System.out.println("No");
        }
    }
}
'''
풀이:
입력함수 '''Scanner scanner = new Scanner(System.in);'''를 호출하여 문자열로 받아줍니다. 그후 챗봇에 입력한 문자열에 따라 결과값이 다르기때문에 if문을 선언하고 입력한 문자열 A가 "You" 라면 "Me" 그 외 나머지는 "No" 가 출력되도록 합니다.
그러기위해서는 if문의 조건을 A==You일때의 조건을 줘서 출력되는 문자를 구분해줘야하는데 이때 자바에서 '''equals("You")''' 함수를 통해 동등한 경우의 조건을 만들어 줄 수 있습니다.

---

2. ## 기억상실

문제요구사항:
민규는 가벼운 기억상실증을 앓고 있습니다. 오늘 무엇인가를 외우면 잠을 자면서 일부를 잊는 증세를 보입니다. 영어시험을 준비하는 민규는 단어 N개를 모두 외워야 합니다. 민규는 하루에 A개의 단어를 외울 수 있습니다. 하지만, 밤에 잠을 자면서 B개를 까먹습니다. N개를 모두 외우는 날에 민규는 목적을 달성합니다.

또한 모두 외우는 날에는 밤에 단어를 까먹는 것을 생각하지 않고 N개의 단어를 모두 외웠다고 간주합니다. 민규가 외워야 하는 N개의 단어가 주어졌을 때, 단어를 모두 외우려면 며칠이 걸리는지 구하는 프로그램을 작성하세요.

'''java
public class Main {
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 

        int a = scanner.nextInt(); 
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int num=0, day=0;
        
        while (true) {
            day++;
            num=num+a;
            if (num>=n) {
                break;
            }
            num=num-b;
        }

        System.out.println(day); 

    }
}
'''
풀이: N개의 단어를 외우는동안의 걸리는 날짜를 구해야합니다. 하루에 A개의 단어를외우고 B개의 단어를 까먹으므로 입력받을 3개의 변수를 '''Scanner scanner = new Scanner(System.in);''' 이용하여 입력값을 설정하고 외운 단어를 저장할 변수 'num'과 날짜를 셀'day' 를 만들어 0으로 초기화 시켜줍니다. 그리고 특정 날짜가 지날때마다 단어를 외우고 까먹는 과정을 반복해야하므로 '''while(true)''' 문과 '''break;''' 문을 이용하여 민규가 목표로한 단어암기까지 걸리는 날짜를 구해봅니다. while문 내부를 확인해봅니다.

1)day++
→ 하루가 지났다는 뜻으로 날짜를 1 늘린다.

2)num = num + a;
→ 낮 동안 민규가 단어 A개를 외워서 현재 외운 단어 수가 늘어난다

3)if (num >= n) break;
→ 낮에 외운 직후 단어 수가 목표 N개 이상이면, 그날로 모두 외운 것이므로 반복을 끝낸다.
(이 날에는 밤에 까먹는 것을 고려하지 않음)

4)num = num - b;
→ 아직 목표에 못 미쳤다면, 밤에 잠을 자면서 B개의 단어를 잊는다.

5)이 과정을 목표에 도달할 때까지 매일 반복한다.

이렇게 하여 최종적으로 print구문을 통해 day값을 추출합니다.

---

3. ##  등차수열

문제요구사항:
종구는 고등학생이 되어 수열의 개념을 배우게 되었습니다. 등차수열은 연속하는 두 항의 차이가 모두 일정한 수열을 의미합니다. 
다만 종구는 아직 등차수열의 개념이 익숙하지 않아서 자신의 연산이 정확한지 검증해주는 프로그램이 있으면 좋겠다고 생각했습니다.

종구를 위해서 첫째 항 A, 두 항의 차이 B, 몇 번째 항인지 나타내는 N이 입력 되었을 때 N번째의 항을 출력하는 프로그램을 작성하세요.

'''java
public class Main {
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 

        int a = scanner.nextInt(); 
        int b = scanner.nextInt(); 
        int n = scanner.nextInt();
        int count=1;
        
        while (true) {
            a=a+b;
            count++;
            if (count==n) {
                break;
            }
        }
        
        System.out.println(a); 

    }
}
'''
풀이:
입력 함수 '''Scanner scanner = new Scanner(System.in);'''를 사용하여 첫째 항 A, 두 항의 차이 B, 몇 번째 항인지 나타내는 N을 정수 형태로 입력받습니다.
등차수열은 이전 항에 일정한 값 B를 계속 더해가는 수열이므로, 이를 코드로 구현하기 위해 반복문을 사용합니다.
먼저 현재 항의 순서를 나타내는 변수 count를 1로 설정하여 첫째 항임을 표시합니다.
이후 while문을 사용하여 매 반복마다 현재 항 a에 공차 b를 더하고, 항의 개수를 하나 증가시킵니다.
이 과정에서 count가 입력받은 n과 같아지면 원하는 N번째 항에 도달한 것이므로 반복문을 종료합니다.
반복이 끝난 후의 a 값이 바로 N번째 항이므로 이를 출력하면 됩니다.

---

4. ## 림보게임

문제요구사항:
건혁이는 림보게임을 하려고 합니다. 키가 180cm인 건혁이는 모든 것을 잘 하지만 유연성은 좋지 않습니다. 그래서 허리를 최대로 젖혀 걸었을 때의 키가 160cm가 됩니다.

N 단계의 높이가 각각 입력되면 건혁이가 무사히 림보를 통과할 수 있는지 판단하여 모두 통과할 수 있으면 P를 출력하고, 림보에 걸리면 I을 출력한 뒤에 처음으로 부딪힌 림보의 높이를 출력하세요. 단, 림보의 높이와 건혁이의 젖힌 키가 같으면 통과할 수 없습니다.

'''java
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Integer> heights = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            heights.add(scanner.nextInt());
        }

        boolean success = true;
        for (int i = 0; i < n; i++) {
            int h = heights.get(i);
            if (h <= 160) {
                System.out.println("I " + h);
                success = false;
                break;
            }
        }

        if (success) {
            System.out.println("P");
        }
    }
}
'''
풀이:입력 함수 '''Scanner scanner = new Scanner(System.in);'''를 사용하여 림보 단계의 개수 N을 먼저 입력받고, 이후 각 림보의 높이를 리스트에 저장합니다.
여러 개의 림보 높이를 순서대로 검사해야 하므로 ArrayList를 사용하여 입력값을 관리합니다.
건혁이가 허리를 최대한 젖혔을 때의 키는 160cm이므로, 림보의 높이가 160cm 이하일 경우에는 통과할 수 없습니다.
이를 판단하기 위해 for문을 사용하여 리스트에 저장된 림보 높이를 앞에서부터 하나씩 확인합니다.
검사 도중 높이가 160 이하인 림보가 발견되면, 그 즉시 "I"와 함께 처음 부딪힌 림보의 높이를 출력하고 더 이상의 검사는 필요 없으므로 반복문을 종료합니다.
이때 림보에 걸렸음을 표시하기 위해 success 변수를 false로 변경합니다.
모든 림보를 검사한 뒤에도 한 번도 걸리지 않았다면, 건혁이가 모든 림보를 통과한 것이므로 "P"를 출력합니다.
