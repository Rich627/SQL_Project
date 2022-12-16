package project;
import java.util.Random;

public class parkingtime {
	
	public static void main(String[] args) {
	    Random random = new Random();

	  
	    for (int i = 0; i < 100; i++) {
	      int minute = random.nextInt(180);
	      
	      String time = String.format("%02d", minute);
	      System.out.println(time);
	    }
	  }
}

/*
Result
25
113
172
124
94
85
162
41
53
100
14
112
103
49
17
72
69
56
168
151
116
80
42
16
47
179
94
03
57
97
83
177
139
53
178
40
90
28
19
23
81
71
07
136
62
28
146
87
143
157
34
171
21
49
50
131
61
173
133
163
91
167
134
30
120
165
100
140
172
128
134
21
46
81
90
41
120
173
119
47
94
06
42
109
54
14
98
05
30
83
128
106
87
73
178
131
170
111
50
161
*/