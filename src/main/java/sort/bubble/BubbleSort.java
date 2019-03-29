package sort.bubble;

import java.util.stream.IntStream;

/*
平均計算量： O(n2)

先頭から順に要素の終わりまで順に次の要素と比較し、順序が逆の場合は要素を入れ替えていく
これを要素数－１回繰り返す
*/

public class BubbleSort
{
  // Singleton用
  private static BubbleSort bubbleSort = new BubbleSort(); 
  
  // 外部からインスタンス化できないようにコンストラクタをprivate化
  private BubbleSort()
  { 
  }
  
  // インスタンスを返す
  public static BubbleSort getInstance()
  {
    return bubbleSort;
  }
  
  /**
   *  ソート実行（ループ版）
   * @param argData       ソートデータ群
   * @return
   */
  public int[] execute(
                  int[] argData
                  )
  {
    int tempVal = -1;

    System.out.println("[execute]");
    
    // 最後の１個前の要素まで確認する（インデックスの次の要素をチェックするので１回不要）
    for( int i = 0; i < argData.length - 1; i++ )
    {
      // 未チェックの範囲のみソートしていく
      for( int j = 0; j < argData.length - 1 - i; j++ )
      {
        // 要素の入れ替えが必要な場合は入れ替える
        if(   argData[ j + 1 ] < argData[ j ]
          )
        {
          tempVal = argData[ j ];
          
          argData[ j ] = argData[ j + 1 ];
          
          argData[ j + 1 ] = tempVal;
        }
        
        // 結果をログに出力
        this.outputArrayStatus(
                  argData,
                  i,
                  j
                    );
      }
    }
    
    return argData;
  }
  
  /**
   *  ソート実行（Stream版）
   * @param argData       ソートデータ群
   * @return
   */
  public int[] executeSteam(
                  int[] argData
                  )
  {
    System.out.println("[executeSteam]");
    
    // 最後の１個前の要素まで確認する（インデックスの次の要素をチェックするので１回不要）
    IntStream.range( 0, argData.length - 1 ).forEach( i -> {
      
        // 未チェックの範囲のみソートしていく
        IntStream.range( 0, argData.length - 1 - i ).forEach( j -> {
        
          // 要素の入れ替えが必要な場合は入れ替える
          if(   argData[ j + 1 ] < argData[ j ]
            )
          {
            int tempVal = argData[ j ];
            
            argData[ j ] = argData[ j + 1 ];
            
            argData[ j + 1 ] = tempVal;
          }

          // 結果をログに出力
          this.outputArrayStatus(
                                argData,
                                i,
                                j
                                );
        });
    
      });
    
    return argData;
  }
  
  /**
   * 結果をログに出力
   * @param argData
   * @param argIndexI
   * @param argIndexJ
   */
  private void outputArrayStatus(
                  int[] argData,
                  int argIndexI,
                  int argIndexJ
                  )
  {
  String strDelimiter = "";
  
  System.out.print( "[i:" + argIndexI + ", j:" + argIndexJ + "] Array Data is [");
  
  strDelimiter = "";
  
  for( int val : argData )
  {
    System.out.print( strDelimiter + val );
    
    strDelimiter = " ";
  }
  
  System.out.println("]  ");
  }
}
