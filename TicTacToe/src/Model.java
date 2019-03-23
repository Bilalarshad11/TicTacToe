
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bilal Arshad
 */
public class Model {
    int [][]arr = {{-1,-1,-1},{-1,-1,-1},{-1,-1,-1}};
     public boolean OWin()
    {
        
        boolean flag = false;
        if(arr[0][0] == 1 && arr[0][1] == 1 && arr[0][2] == 1 )
        {
            flag = true;
        }
        if(arr[1][0] == 1 && arr[1][1] == 1 && arr[1][2] == 1 )
        {
            flag = true;
        }
        if(arr[2][0] == 1 && arr[2][1] == 1 && arr[2][2] == 1 )
        {
            flag = true;
        }
        if(arr[0][0] == 1 && arr[1][0] == 1 && arr[2][0] == 1 )
        {
            flag = true;
        }
        if(arr[0][1] == 1 && arr[1][1] == 1 && arr[2][1] == 1 )
        {
            flag = true;
        }
        if(arr[0][2] == 1 && arr[1][2] == 1 && arr[2][2] == 1 )
        {
            flag = true;
        }
        if(arr[0][0] == 1 && arr[1][1] == 1 && arr[2][2] == 1 )
        {
            flag = true;
        }
        if(arr[0][2] == 1 && arr[1][1] == 1 && arr[2][0] == 1 )
        {
            flag = true;
        }
        
        if( flag)
        {
            return true;
        }
        else 
            return false;
    }
    
    
    
    
     public boolean XWin()
    {
        
        boolean flag = false;
        if(arr[0][0] == 2 && arr[0][1] == 2 && arr[0][2] == 2 )
        {
            flag = true;
        }
        if(arr[1][0] == 2 && arr[1][1] == 2 && arr[1][2] == 2 )
        {
            flag = true;
        }
        if(arr[2][0] == 2 && arr[2][1] == 2 && arr[2][2] == 2 )
        {
            flag = true;
        }
        if(arr[0][0] == 2 && arr[1][0] == 2 && arr[2][0] == 2 )
        {
            flag = true;
        }
        if(arr[0][1] == 2 && arr[1][1] == 2 && arr[2][1] == 2 )
        {
            flag = true;
        }
        if(arr[0][2] == 2 && arr[1][2] == 2 && arr[2][2] == 2 )
        {
            flag = true;
        }
        if(arr[0][0] == 2 && arr[1][1] == 2 && arr[2][2] == 2 )
        {
            flag = true;
        }
        if(arr[0][2] == 2 && arr[1][1] == 2 && arr[2][0] == 2 )
        {
            flag = true;
        }
        
       if( flag)
        {
            return true;
        }
        else 
            return false;
    }
     
     
      public boolean CheckDraw()
     {
      
         boolean IsEmpty=true;
         for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                if(arr[i][j]== -1)
                {
                    IsEmpty = false;
                    break;
                }
            }
        }
         if(IsEmpty)
         {
            return true;
         }
         else
             return false;
         
     }

}
