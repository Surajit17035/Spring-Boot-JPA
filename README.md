## How to push code in Github.
1. git init
2. git add README.md
3. git commit -m "first commit"
4. git branch -M main
5. git remote add origin https://github.com/Surajit17035/Spring-Boot-JPA.git
6. git push -u origin main

   ## Console Base Application
   - It has Spring Data JPA implemented in this project.
   - ORM concept has been used
   - Postegresql Database connectivity with Basic CRUD operation. (Create, Read, Update, Delete)
  
  - CREATE - save() method from JpaRepository interface
  - READ - findAll(), findById() or you can create any custome method in Repositoty.
  - Update - update() method from JpaRepository interface
  - Delete - delete() method from JpaRepository interface
