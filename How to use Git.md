# How to use Git

This article is the reading notes about the [Git](https://www.liaoxuefeng.com/wiki/0013739516305929606dd18361248578c67b8067c8c017b000).

## Chapter 1  Install and initializers

### 1.1 Initializers

> git config --global user.name " Your name"
>
> git config --global user.email " Your email"

### 1.2 Create your own repository 

> mkdir : create a empty folder
>
> pwd: show the directory
>
> $ git : initialize a git repository
>
> $ init : make directory as git repository

### 1.3 Upload the file.

> $ git add filename
>
> $ git commit -m "file describe"
>
> $ git status   # check your repository status
>
> $ git diff filename
>
> $ git log (--pretty = oneline)  # commit id
>
> $ git reset -- hard HEAD^ (or git reset -- hard commit in)
>
> $ git reflog # save all orders

## Chapter 2 Git theory

### 2.1 The three states

![Figure 6. Working tree, staging area, and Git directory. ](https://git-scm.com/book/en/v2/images/areas.png)

**The Git directory** is where Git stores the metadata and object database for your project. This is the most important part of Git, and it is what is copied when you *clone* a repository from another computer.The git is hidden in your folder.

**The working tree** is a single checkout of one version of the project. These files are pulled out of the compressed database in the Git directory and placed on disk for you to use or modify.

**The staging area** is a file, generally contained in your Git directory, that stores information about what will go into your next commit. Its technical name in Git parlance is the “index”, but the phrase “staging area” works just as well.

The basic Git workflow goes something like this:

1. You modify files in your **working tree**.
2. You selectively stage just those changes you want to be part of your next commit, which adds only those changes to **the staging area**. ($ git add filename)
3. You do a commit, which takes the files as they are in the staging area and stores that snapshot permanently to your **Git directory**. ($ git commit -m "description")

## Chapter 3 Github

### 3.1 Create SSH key

The connection of Github and local git repository is used by **SSH**, so we need to set something about **SSh**.
When you finish setting,your lcoal folder should have a *.ssh* directory with two files named ***id_rsa* **and ***id_rsa.pub***  there, if not, open shell or git Bash, create **SSH** key:

> ```
> $ ssh-keygen -t rsa -C "youremail@example.com"
> ```

Use your email instead,and don't change and setting, just press enter is ok. Then you'll have above two files, and the ***id_rsa* ** is personal key, the ***id_rsa.pub*** is public key.

### 3.2 Login Github







