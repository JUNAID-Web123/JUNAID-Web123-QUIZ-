# basic concepts

# x=5 #variable is assigned by a value (int)
# y=10.0 #(float)
# z="hello" #(str)
# p=True #(bool)
# q=None #(NoneType)
# r=[1,2,3]
# s=(1,)
# t={
#     "name":"juanid"
# }
# u={1} #set
# print(type(x),type(y),type(z),type(p),type(q),type(r),type(s),type(t),type(u))

# arithmetic operations
# a=3
# b=4

# print(a+b)
# print(a-b)
# print(a**b)
# print(a%b)
# print(a//b)
# print(a*b)
# print(a/b)

#comaprison operations
# print(a==b)
# print(a!=b)
# print(a<b)
# print(a>b)
# print(a<=b)
# print(a>=b)
#Assignment operations

# a+=b

# print(a)
# a-=b
# print(a)
# a*=b
# print(a)
# a**=b
# print(a)
# a/=b
# print(a)
# a//=b
# print(a)
# a%=b
# print(a)

#logical operations
# print(a==b and b==a)
# print(a==b or b==a)
# print(not(a==b))
#identity operations
# x=12
# y=x
# print(x is y)
# print(x is not y)
# membership operations
# set = {1, 2, 3, 4, 5}
# set2={6,7,8,9,10}
# print(1 in set)
# print(6 not in set and 6 in set2)
# print(a&b)
# print(a|b)
# print(a^b)
# print(a<<b)
# print(a>>b)
# print(~a==b)
# x=2
# y=5.5
# print(x+y)
# print(int(x)+int(y))
# x=float(input("enter the number"))
# list=[1, 2, 3, 4, 5]
# i=0
# while i<len(list):
#     print(list[i])
#     i+=1
# name="jz"
# i=0
# while i<len(name):
#     if name[i]=="a" or name[i]=="e" or name[i]=="i" or name[i]=="o" or name[i]=="u":
#         print(name[i])
#         continue
#     else:
#         print("consonents")
        
    
#     i+=1
# list=[1,23,4,5,6,77]
# i=0
# x=23
# while i<len(list):
#     if x==list[i]:
#         print("found at indx",i)
#     i+=1   
# list=(1,2,3,4,5,6,7,8,9)
# x=0
# for i in list:
#     if x==i:
#         print("found at index ",list.index(i))
#     else:
#         print("not found")
# n=5
# for i in range(1,11):
#     print(i*n)            
# i=0
# sum=0
# n=5
# while i<=n:
#     sum*=i
    
#     i+=1    
# print(sum)  
# n=5
# sum=0
# for i in range(1,n+1):
#     sum+=i
# print(sum)      
# n=5
# fact=1
# for i in range(1,n+1):
#     fact*=i
# print(fact)  
# for i in range(0,1001,200):
#     pass

# i=0
# while i<=5:
#     print(i)
#     if i==3:
#         print("found")
#         break
    
         
#     i+=1
# tuple=(1,2,3,4,5,6,7,8,9)
# x=7
# idx=0
# for i in tuple:
#     if i==x:
#         print("found",tuple.index(i))
#     idx+=1
# n=4    
# for i in range(1,11):
#     print(i*n)   
# i=1
# sum=1
# n=5
# while i<=n:
#     sum*=i
#     i+=1
# print(sum)
# sum=1
# n=5
# for i in range(1,n+1):
#     sum*=i
# print(sum)  
# list=[1,2,3,4,5]
# def print_len(list):
#     for i in list:
#         print(i , end=" ")
# print_len(list)
# print() 




# list2=[1,2,3,4,5]
# print_len(list2)
# def natural_num(n=3):
#     sum=0
#     for i in range(1,n+1):
#         sum+=i
#     print(sum)
# natural_num() 
# def odd_even(n):
#     if n%2==0:
#         print("E")
#         sq=n**2
#         print(sq)
#         return 
#     else:
#         return odd_even(n-1)
        
# odd_even(13)
# list=[1, 2, 3, 4, 5]
# def list_len(list):
#     for i in list:
#         print(i, end=" " )
# list_len(list)

# heroes=["ironman","krish","thor","hulk"]
# list_len(heroes)
# def fact_num(n):
#     fact=1
#     for i in range(1,n+1):
#         fact*=i
#         return fact
# print(fact_num(10)) 
# def factorial(n):
#     fact=1
#     for i in range(1,n+1):
#         fact*=i
#     return fact
# print(factorial(5))

# fact=1
# n=5
# for i in range(1,n+1):
#     fact*=i
# print(fact)    
# def sq(n):
#     if n%2==0:
#         print("E")
#         sq=n**2
#         return sq
#     else:
#         return 0
# print(sq(8))  

# def add(b , a=1):
#     return b+a
# print(add(2))

def len_list(list):
    print(len(list))
list={
    "name":"junaid",
    "subjects":{
        "maths": 90,
        "english": 85,
        "science": 95
    }
}
len_list(list)