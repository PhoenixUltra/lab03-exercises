def find_duplicates_nested_loop(l: list) -> list:
    s=set()
    length=len(l)

    for i in range(0,length-1):
        for j in range(i+1,length):
            if l[i]==l[j]:
                s.add(l[i])
                break
    
    return list(s)

def find_duplicates_one_set(l: list) -> list:
    d=dict()
    length=len(l)
    duplicates=list()

    for i in range(0,length):
        d[l[i]]=d.get(l[i],0)+1

        if d[l[i]]==2:
            duplicates.append(l[i])
    
    return duplicates

if __name__=="__main__":
    sample1 = [3, 7, 5, 6, 7, 4, 8, 5, 7, 66]
    sample2 = [3, 5, 6, 4, 4, 5, 66, 6, 7, 6]
    sample3 = [3, 0, 5, 1, 0]
    sample4 = [3]

    print("Sample 1:", find_duplicates_nested_loop(sample1))
    print("Sample 2:", find_duplicates_nested_loop(sample2))
    print("Sample 3:", find_duplicates_nested_loop(sample3))
    print("Sample 4:", find_duplicates_nested_loop(sample4))

    print()

    print("Sample 1:", find_duplicates_one_set(sample1))
    print("Sample 2:", find_duplicates_one_set(sample2))
    print("Sample 3:", find_duplicates_one_set(sample3))
    print("Sample 4:", find_duplicates_one_set(sample4))