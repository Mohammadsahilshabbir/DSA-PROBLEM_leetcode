class MyHashSet {
    Set<Integer>ans=new HashSet<>();
    public MyHashSet() {
        
    }
    
    public void add(int key) {
        ans.add(key);
    }
    
    public void remove(int key) {
        ans.remove(key);
    }
    
    public boolean contains(int key) {
        return ans.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */