# Bubble Sort  

## 平均計算量： <img src="https://latex.codecogs.com/gif.latex?\O(n^2)" />  

* 先頭から順に要素の終わりまで順に次の要素と比較し、次の要素が小さい場合は要素を入れ替えていく
* 先頭の要素を1つずつずらしながら上記の処理を要素の最後まで繰り返す

## 実行ログ

Bubble Sort App Start!  
Array Data is [8, 4, 3, 7, 6, 5, 2, 1]  
[i:0, j:0] Array Data is [4 8 3 7 6 5 2 1]  
[i:0, j:1] Array Data is [4 3 8 7 6 5 2 1]  
[i:0, j:2] Array Data is [4 3 7 8 6 5 2 1]  
[i:0, j:3] Array Data is [4 3 7 6 8 5 2 1]  
[i:0, j:4] Array Data is [4 3 7 6 5 8 2 1]  
[i:0, j:5] Array Data is [4 3 7 6 5 2 8 1]  
[i:0, j:6] Array Data is [4 3 7 6 5 2 1 8]  
[i:1, j:0] Array Data is [3 4 7 6 5 2 1 8]  
[i:1, j:1] Array Data is [3 4 7 6 5 2 1 8]  
[i:1, j:2] Array Data is [3 4 6 7 5 2 1 8]  
[i:1, j:3] Array Data is [3 4 6 5 7 2 1 8]  
[i:1, j:4] Array Data is [3 4 6 5 2 7 1 8]  
[i:1, j:5] Array Data is [3 4 6 5 2 1 7 8]  
[i:2, j:0] Array Data is [3 4 6 5 2 1 7 8]  
[i:2, j:1] Array Data is [3 4 6 5 2 1 7 8]  
[i:2, j:2] Array Data is [3 4 5 6 2 1 7 8]  
[i:2, j:3] Array Data is [3 4 5 2 6 1 7 8]  
[i:2, j:4] Array Data is [3 4 5 2 1 6 7 8]  
[i:3, j:0] Array Data is [3 4 5 2 1 6 7 8]  
[i:3, j:1] Array Data is [3 4 5 2 1 6 7 8]  
[i:3, j:2] Array Data is [3 4 2 5 1 6 7 8]  
[i:3, j:3] Array Data is [3 4 2 1 5 6 7 8]  
[i:4, j:0] Array Data is [3 4 2 1 5 6 7 8]  
[i:4, j:1] Array Data is [3 2 4 1 5 6 7 8]  
[i:4, j:2] Array Data is [3 2 1 4 5 6 7 8]  
[i:5, j:0] Array Data is [2 3 1 4 5 6 7 8]  
[i:5, j:1] Array Data is [2 1 3 4 5 6 7 8]  
[i:6, j:0] Array Data is [1 2 3 4 5 6 7 8]  
