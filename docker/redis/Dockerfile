FROM redis:alpine

COPY ./docker-entrypoint.sh /docker-entrypoint.sh
RUN chmod 755 /docker-entrypoint.sh

EXPOSE 6379

ENTRYPOINT ["/docker-entrypoint.sh"]
CMD ["zeus-redis-cluster"]