# Chain of Builders

Develop variable syntaxes for DSLs internal to (embedded with)
Java. The examples adopt the notion of [Ansible](https://www.ansible.com/) [playbooks](https://docs.ansible.com/ansible/latest/user_guide/playbooks.html).

https://github.com/mrcalvin/cob-ansible

This is the supplementary Web site to the manuscript *Chain of
Builders: A Pattern of Variable Syntax Processing for Internal DSLs*
(submitted to [EuroPLoP'19](http://europlop.net/content/call-papers-europlop-2019)) by
[Stefan Sobernig](https://nm.wu.ac.at/nm/sobernig).

The supplemental material includes implementation examples for the
CHAIN OF BUILDERS pattern in Java 8+; see
[`App.java`](src/main/java/at/ac/wu/nm/ansible/App.java).

### Running

Set `JAVA_HOME`

```
export JAVA_HOME=`/usr/libexec/java_home -v 1.8`
```

Run maven test target

```
mvn test
```











