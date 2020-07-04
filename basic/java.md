
## java 8大基本类型
- boolean, byte, char, short, int, long, float, double
- byte：8位，最大存储数据量是255，存放的数据范围是-128~127之间。
- short：16位，最大数据存储量是65536，数据范围是-32768~32767之间。
- int：32位，最大数据存储容量是2的32次方减1，数据范围是负的2的31次方到正的2的31次方减1。
- long：64位，最大数据存储容量是2的64次方减1，数据范围为负的2的63次方到正的2的63次方减1。
- float：32位，数据范围在3.4e-45~1.4e38，直接赋值时必须在数字后加上f或F。
- double：64位，数据范围在4.9e-324~1.8e308，赋值时可以加d或D也可以不加。
- boolean：只有true和false两个取值。
- char：16位，存储Unicode码，用单引号赋值。

## java 容器

### List
```java
 public static void main(String[] args) {
        // List基本操作
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        List<Integer> list2 = new ArrayList<>();
        //第一种循环输入方式
        for (String str : list) {
            System.out.println("第一种输出list值：" + str);
        }

        //第二种循环输出方式
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println("第二种输出list值：" + str);
        }

        //第三种循环输出方式
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println("第三种输出list值：" + it.next());
        }
    //第四种循环输出方式
   list.forEach(str -> System.out.println("JDK8中输出list值：" + str));
    }
```

### Stack
```java
```

### Queue
```java
public static void main(String[] args) {
        //add()和remove()方法在失败的时候会抛出异常(不推荐)
        Queue<String> queue = new LinkedList<String>();
        //添加元素
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");
        for (String q : queue) {
            System.out.println("循环队列：" + q);
        }
        System.out.println("---------------------");
        System.out.println("获取第一个元素并把这个删除：" + queue.poll()); //返回第一个元素，并在队列中删除
        System.out.println("---------------");
        System.out.println("获取第一个元素=" + queue.element()); //返回第一个元素，不移除,使用element()或peek()方法
        for (String q : queue) {
            System.out.println(q);
        }
    }
```

### Map
- 定义: HashMap<String, Double> map = new HashMap<>();
- 插入元素: map.put("math", 80.0);
- 删除:map.remove("key1");
- 查找：map.get("key1")
- 清空：map.clear();
```java
public static void main(String[] args) {
        HashMap<String, Double> scores = new HashMap<>();
        scores.put("语文", 89.0);
        scores.put("数学", 83.0);
        scores.put("英文", 84.0);
        System.out.println(scores.values());
        Set<Map.Entry<String, Double>> entrySet = scores.entrySet();
        for (Map.Entry<String, Double> entry : entrySet) {
            System.out.println("取得key：" + entry.getKey());
            System.out.println("对应的value为：" + entry.getValue());
        }
        System.out.println("是否包含key："+ scores.containsKey("语文"));
        System.out.println("是否包含value："+ scores.containsValue(83.0));
    }
```