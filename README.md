# Chain of Builders

Develop variable syntaxes for DSLs internal to (embedded with)
Java. The examples adopt the notion of [Ansible](https://www.ansible.com/) [playbooks](https://docs.ansible.com/ansible/latest/user_guide/playbooks.html).

https://github.com/mrcalvin/cob-ansible

This is the supplementary Web site to the paper:

[Stefan Sobernig](https://nm.wu.ac.at/nm/sobernig). 2019. Chain of builders: a pattern of variable syntax processing for internal DSLs. In Proceedings of the 24th European Conference on Pattern Languages of Programs (EuroPLop '19). ACM, Article 29. DOI: https://doi.org/10.1145/3361149.3361179 

(accepted to and workshopped at [EuroPLoP'19](http://europlop.net/content/call-papers-europlop-2019))

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











