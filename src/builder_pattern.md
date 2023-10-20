
## Documentation

### Problems builder pattern is solving:

1. Student s = new Student(name, age, rollno, class...)

   When having many parameters, prone to errors, not readable, bad developer experience.

2. When creating different objects as Student, Teacher, TAs,

Student - name, email, phone

Teacher - name, age, yearsOfExperience

TAs - mentees, Batch

When creating different type of users we cannot use same constructor as it will set many fields to null,

So we can use multiple parameterised constructors, which creates constructor telescoping anti-pattern, which is not maintainable, neither extensible. If in future any new field is added or removed, difficult to change at every places. Confusing in creating objects.

3. Constructor provides a contract saying, create an object only with these set of prameters. Builder pattern helps in on demand object initialisation. In real world, on demand initialization is what is needed. Eg. - Sometimes we would want Student only with first name.

4. We would many a time wants immutable objects (without setters and private fields). With default constructors, we cannot provide values and constructor telescoping is a bad idea. Builder pattern helps create immutable object, with on demand initialisation.

5. One way to initialise attributes is using set methods, but this way we cannot have immutability, and validation can only be done on a single attribute at a time. Eg.- We want to have firstName+lastName to be less than 20 words. setFirstName can only check for first name. Builder pattern helps in complex validation on combination of attributes.



