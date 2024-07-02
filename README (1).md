# metodosordenacaoGB
Análise Comparativa dos Métodos de Ordenação

# Tabela Media
| Tamanho do Array (n) | Bubble Sort          | Insertion Sort       | Selection Sort       | Heap Sort            | Shell Sort           | Merge Sort           | Quick Sort           |
|----------------------|----------------------|----------------------|----------------------|----------------------|----------------------|----------------------|----------------------|
| 128                  | 54265.0 ns           | 46052.5 ns           | 55150.0 ns           | 15627.5 ns           | 36429.8 ns           | 23397.5 ns           | 13007.5 ns           |
| 256                  | 71029.9 ns           | 43917.5 ns           | 71549.9 ns           | 17215.0 ns           | 32722.4 ns           | 57067.5 ns           | 58705.0 ns           |
| 512                  | 69549.9 ns           | 66324.9 ns           | 188704.9 ns          | 27782.7 ns           | 38782.3 ns           | 48952.5 ns           | 6965.0 ns            |
| 1024                 | 293599.9 ns          | 134294.8 ns          | 818094.9 ns          | 35400.1 ns           | 25782.4 ns           | 54252.4 ns           | 16534.9 ns           |
| 2048                 | 1085082.5 ns         | 218364.8 ns          | 2838477.5 ns         | 115012.5 ns          | 54955.0 ns           | 131244.8 ns          | 37860.1 ns           |
| 4096                 | 3789062.4 ns         | 1079680.0 ns         | 10987182.5 ns        | 209829.6 ns          | 132024.9 ns          | 213497.5 ns          | 109275.2 ns          |
| 65536                | 1795000007.5 ns      |                      |                      |                      |                      |                      |                      |

# Array Ordenado em Ordem Crescente, Sem Valores Repetidos

| Tamanho do Array (n) | Bubble Sort | Insertion Sort | Selection Sort | Heap Sort | Shell Sort | Merge Sort | Quick Sort |
|----------------------|-------------|----------------|----------------|-----------|------------|------------|------------|
| 128                  | 166160.1 ns | 5680.0 ns      | 136310.0 ns    | 29940.1 ns| 28089.8 ns | 54259.8 ns | 33349.9 ns |
| 256                  | 77589.7 ns  | 1119.9 ns      | 79470.1 ns     | 20680.1 ns| 56899.7 ns | 17830.1 ns | 47590.0 ns |
| 512                  | 42600.0 ns  | 19569.9 ns     | 205969.7 ns    | 38660.3 ns| 16669.8 ns | 27409.7 ns | 6169.9 ns  |
| 1024                 | 206329.8 ns | 17890.3 ns     | 832320.1 ns    | 37010.3 ns| 9069.9 ns  | 52200.0 ns | 14079.9 ns |
| 2048                 | 640899.8 ns | 7520.0 ns      | 3413400.1 ns   | 132850.0 ns| 19820.1 ns | 102589.9 ns| 20370.4 ns |
| 4096                 | 2691679.7 ns| 4120.2 ns      | 1.37695198E7 ns| 198680.0 ns| 40789.6 ns | 178889.9 ns| 50560.8 ns |
| 65536                | 5.2167673E8 ns | 62670.0 ns            | 3.43067931E9 ns           |  3096050.3 ns         |  776840.1 ns         |  3606110.1 ns          | 964349.7 ns          |

# Array Ordenado em Ordem Decrescente, Sem Valores Repetidos

| Tamanho do Array (n) | Bubble Sort | Insertion Sort | Selection Sort | Heap Sort | Shell Sort | Merge Sort | Quick Sort |
|----------------------|-------------|----------------|----------------|-----------|------------|------------|------------|
| 128                  | 24089.9 ns  | 161920.0 ns    | 27050.1 ns     | 12590.0 ns| 40469.6 ns | 16290.1 ns | 8360.1 ns  |
| 256                  | 83850.0 ns  | 69630.0 ns     | 82760.0 ns     | 16809.7 ns| 34980.1 ns | 63359.9 ns | 82400.0 ns |
| 512                  | 66529.9 ns  | 130669.9 ns    | 210880.1 ns    | 34360.2 ns| 33859.7 ns | 81200.2 ns | 8110.0 ns  |
| 1024                 | 297230.3 ns | 395989.8 ns    | 849899.6 ns    | 34840.1 ns| 12809.9 ns | 53749.8 ns | 18470.2 ns |
| 2048                 | 1008660.1 ns| 496600.3 ns    | 3359360.0 ns   | 113320.0 ns| 22810.1 ns | 121899.8 ns| 38929.9 ns |
| 4096                 | 4024039.9 ns| 2211050.0 ns   | 1.32781402E7 ns| 203880.4 ns| 58029.8 ns | 171919.7 ns| 78699.9 ns |
| 65536                | 1.05068126E9 ns  |  3.42874605E9 ns            |  3190090.1 ns      |   1061870.2 ns                  |   5.0246461E8 ns                  |  3994529.7 ns                    |   1834990.1 ns

# Array Aleatório Sem Valores Repetidos

| Tamanho do Array (n) | Bubble Sort | Insertion Sort | Selection Sort | Heap Sort | Shell Sort | Merge Sort | Quick Sort |
|----------------------|-------------|----------------|----------------|-----------|------------|------------|------------|
| 128                  | 15000.1 ns  | 6799.9 ns      | 12420.0 ns     | 8680.0 ns | 28809.8 ns | 11579.9 ns | 5119.9 ns  |
| 256                  | 90699.8 ns  | 63690.2 ns     | 72030.0 ns     | 13649.9 ns| 22699.9 ns | 52150.0 ns | 51360.2 ns |
| 512                  | 75740.1 ns  | 49409.9 ns     | 129220.1 ns    | 22120.2 ns| 36229.9 ns | 38530.0 ns | 6260.0 ns  |
| 1024                 | 258639.7 ns | 42460.0 ns     | 613740.2 ns    | 30149.9 ns| 15129.9 ns | 49560.0 ns | 16799.7 ns |
| 2048                 | 980949.9 ns | 221599.7 ns    | 2214139.9 ns   | 91050.1 ns| 74150.1 ns | 125819.7 ns| 32560.3 ns |
| 4096                 | 3353150.0 ns| 761960.0 ns    | 8032950.0 ns   | 177390.0 ns| 158560.1 ns| 231979.9 ns| 119139.9 ns|
| 65536                | 2.10047191E9 ns  | 1.5658188E8 ns  | 2.1234675596E9 ns  | 3867469.8 ns | 4081220.8 ns | 4822550.0 ns  |2931419.9 ns    | 

# Array Aleatório Com Valores Repetidos

| Tamanho do Array (n) | Bubble Sort | Insertion Sort | Selection Sort | Heap Sort | Shell Sort | Merge Sort | Quick Sort |
|----------------------|-------------|----------------|----------------|-----------|------------|------------|------------|
| 128                  | 26009.9 ns  | 11010.1 ns     | 20820.0 ns     | 11300.0 ns| 48350.1 ns | 11460.0 ns | 5200.0 ns  |
| 256                  | 31980.1 ns  | 51229.8 ns     | 51939.9 ns     | 17720.0 ns| 16509.8 ns | 94930.0 ns | 53469.8 ns |
| 512                  | 93329.9 ns  | 65649.9 ns     | 208750.0 ns    | 15989.9 ns| 68369.8 ns | 48870.0 ns | 7320.0 ns  |
| 1024                 | 410200.0 ns | 80840.0 ns     | 978419.9 ns    | 39600.0 ns| 66119.8 ns | 61699.9 ns | 16789.9 ns |
| 2048                 | 1705020.2 ns| 357739.2 ns    | 3566530.1 ns   | 123830.0 ns| 123840.0 ns| 177670.2 ns| 59380.4 ns |
| 4096                 | 5067380.1 ns| 1300569.9 ns   | 1.32424495E7 ns| 257369.9 ns| 273720.2 ns| 273200.4 ns| 187700.0 ns|
| 65536                | 3.50717013E9 ns | 2.5083247E8 ns  | 3.4424180199E9 ns       |  5064019.9 ns     |  1.12098397E7 ns      | 6260580.2 ns         | 3865999.6 ns             |