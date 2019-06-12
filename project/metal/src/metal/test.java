/*
package metal;

public class test {
	
    private int top;
    private int maxSize;
    private Object[] stackArray;
    
    // �迭 ���� ����,  ������ �ִ� ũ��� ����
    public void ArrayStack(int maxSize){
        
        this.maxSize = maxSize;
        this.stackArray = new Object[maxSize];
        this.top = -1;
    }
    
    // ������ ����ִ��� üũ
    public boolean empty(){
        return (top == -1);
    }
    
    // ������ ��á���� üũ
    public boolean full(){
        return (top == maxSize-1);
    }
    
    // ���ÿ� item �Է�
    public void push(Object item){
        
        if(full()) throw new ArrayIndexOutOfBoundsException((top+1)+">=" + maxSize);
        
        stackArray[++top] = item;
    }
    
    // ������ ���� ���� ������ ��ȯ
    public Object peek(){
        
        if(empty()) throw new ArrayIndexOutOfBoundsException(top);
        
        return stackArray[top];
    }
    
    // ������ ���� ���� ������ ����
    public Object pop(){
        
        Object item = peek();
        
        top--;
        
        return item;
    }

    int check_matching(char *in)
    {
    	Stack s;
    	char ch=0, open_ch;
    	int i, n = strlen(in);
    	init(&s);
    	for(i=0;i<n;i++){
    		ch=in[i];



    		switch(ch){
    			case'(': case'[':case'{':
    			Push(&s,ch);
    			break;

    			case')': case']': case'}':
    			if(IsEmpty(&s)) return FALSE;
    			else {
    				open_ch = Pop(&s);
    				if((open_ch == '(' && ch != ')') || (open_ch == '[' && ch != ']') || (open_ch == '{' && ch != '}')){
    					return FALSE;
    				}
    				break;
    			}
    		}
    	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
*/