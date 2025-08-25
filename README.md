# 简单计算器项目

这是一个用Java编写的简单计算器项目，提供基本的四则运算功能。

## 功能特性

- **加法运算**: 支持两个整数相加
- **减法运算**: 支持两个整数相减
- **乘法运算**: 支持两个整数相乘
- **除法运算**: 支持两个整数相除，包含除数为0的检查

## 技术栈

- Java 8+
- Maven构建工具

## 使用方法

### 编译和运行

```bash
# 编译项目
mvn compile

# 运行测试
mvn test

# 运行主程序
mvn exec:java -Dexec.mainClass="com.example.Calculator"
```

### 代码示例

```java
Calculator calc = new Calculator();

// 加法
int sum = calc.add(10, 5); // 结果: 15

// 减法
int difference = calc.subtract(10, 5); // 结果: 5

// 乘法
int product = calc.multiply(10, 5); // 结果: 50

// 除法
int quotient = calc.divide(10, 5); // 结果: 2

// 除数为0时会抛出异常
try {
    calc.divide(10, 0);
} catch (IllegalArgumentException e) {
    System.out.println("错误: " + e.getMessage());
}
```

## 项目结构

```
src/
└── main/
    └── java/
        └── com/
            └── example/
                └── Calculator.java
```

## 贡献

欢迎提交Issue和Pull Request来改进这个项目。

## 许可证

MIT License