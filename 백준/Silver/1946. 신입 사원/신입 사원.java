import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine()); // 지원자 수
            int[][] applicants = new int[N][2];

            // 지원자 입력
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                applicants[i][0] = Integer.parseInt(st.nextToken()); // 서류심사 성적
                applicants[i][1] = Integer.parseInt(st.nextToken()); // 면접 성적
            }

            // 서류심사 성적 기준 오름차순 정렬
            Arrays.sort(applicants, Comparator.comparingInt(a -> a[0]));

            // 선발 가능한 최대 인원 수 계산
            int count = 1; // 첫 번째 지원자는 무조건 선발
            int minInterviewRank = applicants[0][1]; // 최소 면접 성적 기록

            for (int i = 1; i < N; i++) {
                if (applicants[i][1] < minInterviewRank) {
                    count++; // 선발 가능
                    minInterviewRank = applicants[i][1]; // 최소 면접 성적 갱신
                }
            }

            sb.append(count).append("\n");
        }

        System.out.print(sb.toString());
    }
}
